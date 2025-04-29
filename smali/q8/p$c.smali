.class public Lq8/p$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Lq8/p$g;

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(Lq8/p$g;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq8/p$c;->a:Lq8/p$g;

    iput-boolean p2, p0, Lq8/p$c;->b:Z

    iput-boolean p3, p0, Lq8/p$c;->c:Z

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lq8/p$c;
    .locals 5

    new-instance v0, Lq8/p$c;

    const-string v1, "name"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lq8/p$g;->b(Ljava/lang/String;)Lq8/p$g;

    move-result-object v1

    const-string v2, "signed"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    const-string v4, "decimal"

    invoke-virtual {p0, v4, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lq8/p$c;-><init>(Lq8/p$g;ZZ)V

    return-object v0
.end method
