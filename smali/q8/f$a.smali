.class Lq8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Lq8/f;


# direct methods
.method constructor <init>(Lq8/f;)V
    .locals 0

    iput-object p1, p0, Lq8/f$a;->j:Lq8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 4

    const-string v0, "locale"

    iget-object v1, p0, Lq8/f$a;->j:Lq8/f;

    invoke-static {v1}, Lq8/f;->a(Lq8/f;)Lq8/f$b;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p1, Lr8/j;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    const-string v2, "Localization.getStringResource"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p2}, Lr8/k$d;->c()V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lr8/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "key"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    iget-object v0, p0, Lq8/f$a;->j:Lq8/f;

    invoke-static {v0}, Lq8/f;->a(Lq8/f;)Lq8/f$b;

    move-result-object v0

    invoke-interface {v0, v2, p1}, Lq8/f$b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "error"

    invoke-interface {p2, v0, p1, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
