.class public final Lp1/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/l0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp1/q;->C(Lp1/u$e;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Lp1/q;

.field final synthetic c:Lp1/u$e;


# direct methods
.method constructor <init>(Landroid/os/Bundle;Lp1/q;Lp1/u$e;)V
    .locals 0

    iput-object p1, p0, Lp1/q$c;->a:Landroid/os/Bundle;

    iput-object p2, p0, Lp1/q$c;->b:Lp1/q;

    iput-object p3, p0, Lp1/q$c;->c:Lp1/u$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lp1/q$c;->a:Landroid/os/Bundle;

    const-string v1, "com.facebook.platform.extra.USER_ID"

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "id"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lp1/q$c;->b:Lp1/q;

    iget-object v0, p0, Lp1/q$c;->c:Lp1/u$e;

    iget-object v1, p0, Lp1/q$c;->a:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Lp1/q;->E(Lp1/u$e;Landroid/os/Bundle;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lp1/q$c;->b:Lp1/q;

    invoke-virtual {v0}, Lp1/f0;->d()Lp1/u;

    move-result-object v0

    sget-object v1, Lp1/u$f;->r:Lp1/u$f$c;

    iget-object v2, p0, Lp1/q$c;->b:Lp1/q;

    invoke-virtual {v2}, Lp1/f0;->d()Lp1/u;

    move-result-object v2

    invoke-virtual {v2}, Lp1/u;->z()Lp1/u$e;

    move-result-object v2

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v3, "Caught exception"

    invoke-static/range {v1 .. v7}, Lp1/u$f$c;->d(Lp1/u$f$c;Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lp1/u$f;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/u;->f(Lp1/u$f;)V

    :goto_1
    return-void
.end method

.method public b(Lp0/s;)V
    .locals 8

    iget-object v0, p0, Lp1/q$c;->b:Lp1/q;

    invoke-virtual {v0}, Lp1/f0;->d()Lp1/u;

    move-result-object v0

    sget-object v1, Lp1/u$f;->r:Lp1/u$f$c;

    iget-object v2, p0, Lp1/q$c;->b:Lp1/q;

    invoke-virtual {v2}, Lp1/f0;->d()Lp1/u;

    move-result-object v2

    invoke-virtual {v2}, Lp1/u;->z()Lp1/u$e;

    move-result-object v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v4, p1

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v3, "Caught exception"

    invoke-static/range {v1 .. v7}, Lp1/u$f$c;->d(Lp1/u$f$c;Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lp1/u$f;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/u;->f(Lp1/u$f;)V

    return-void
.end method
