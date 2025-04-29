.class public final synthetic Lio/flutter/plugins/imagepicker/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lio/flutter/plugins/imagepicker/k;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/imagepicker/k;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/f;->j:Lio/flutter/plugins/imagepicker/k;

    iput p2, p0, Lio/flutter/plugins/imagepicker/f;->k:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/f;->j:Lio/flutter/plugins/imagepicker/k;

    iget v1, p0, Lio/flutter/plugins/imagepicker/f;->k:I

    invoke-static {v0, v1}, Lio/flutter/plugins/imagepicker/k;->d(Lio/flutter/plugins/imagepicker/k;I)V

    return-void
.end method
