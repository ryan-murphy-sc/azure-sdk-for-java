﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Net;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.Python.TemplateModels;
using Microsoft.Rest.Generator.Azure;
using Microsoft.Rest.Generator.Utilities;
using System.Collections;
using System.Text;
using Microsoft.Rest.Generator.Python;

namespace Microsoft.Rest.Generator.Azure.Python
{
    public class AzureModelTemplateModel : ModelTemplateModel
    {
        public AzureModelTemplateModel(CompositeType source, ServiceClient serviceClient)
            : base(source, serviceClient)
        {
        }

        public override string InitializeProperty(Property property)
        {
            if (Azure.AzureExtensions.IsAzureResource(this) && property.SerializedName.Contains("."))
            {
                return string.Format(CultureInfo.InvariantCulture, "'{0}': {{'key': '{1}', 'type': '{2}', 'flatten': True}},", property.Name, property.SerializedName, GetPythonSerializationType(property.Type));
            }
            return base.InitializeProperty(property);
        }

    }
}
