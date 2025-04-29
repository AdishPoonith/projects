.class Lj0/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/j0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj0/a;->d(Ljava/lang/String;Lr8/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr8/k$d;

.field final synthetic b:Lj0/a;


# direct methods
.method constructor <init>(Lj0/a;Lr8/k$d;)V
    .locals 0

    iput-object p1, p0, Lj0/a$b;->b:Lj0/a;

    iput-object p2, p0, Lj0/a$b;->a:Lr8/k$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;Lp0/o0;)V
    .locals 2

    :try_start_0
    iget-object p2, p0, Lj0/a$b;->a:Lr8/k$d;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lj0/a$b;->a:Lr8/k$d;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "FAILED"

    invoke-interface {p2, v1, p1, v0}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
