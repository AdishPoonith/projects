.class public final Lu8/v0$g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu8/v0$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lu8/v0$g;
    .locals 2

    new-instance v0, Lu8/v0$g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu8/v0$g;-><init>(Lu8/v0$a;)V

    iget-object v1, p0, Lu8/v0$g$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lu8/v0$g;->b(Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lu8/v0$g$a;
    .locals 0

    iput-object p1, p0, Lu8/v0$g$a;->a:Ljava/lang/String;

    return-object p0
.end method
