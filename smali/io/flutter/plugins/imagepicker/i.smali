.class public final synthetic Lio/flutter/plugins/imagepicker/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lio/flutter/plugins/imagepicker/k;

.field public final synthetic k:I

.field public final synthetic l:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/imagepicker/k;ILandroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/i;->j:Lio/flutter/plugins/imagepicker/k;

    iput p2, p0, Lio/flutter/plugins/imagepicker/i;->k:I

    iput-object p3, p0, Lio/flutter/plugins/imagepicker/i;->l:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/i;->j:Lio/flutter/plugins/imagepicker/k;

    iget v1, p0, Lio/flutter/plugins/imagepicker/i;->k:I

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/i;->l:Landroid/content/Intent;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/imagepicker/k;->e(Lio/flutter/plugins/imagepicker/k;ILandroid/content/Intent;)V

    return-void
.end method
