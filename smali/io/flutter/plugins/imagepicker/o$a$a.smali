.class public final Lio/flutter/plugins/imagepicker/o$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/o$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lio/flutter/plugins/imagepicker/o$a;
    .locals 2

    new-instance v0, Lio/flutter/plugins/imagepicker/o$a;

    invoke-direct {v0}, Lio/flutter/plugins/imagepicker/o$a;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/o$a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/imagepicker/o$a;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/o$a$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/imagepicker/o$a;->c(Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lio/flutter/plugins/imagepicker/o$a$a;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/o$a$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lio/flutter/plugins/imagepicker/o$a$a;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/o$a$a;->b:Ljava/lang/String;

    return-object p0
.end method
