.class public final synthetic Lc1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lorg/json/JSONObject;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lc1/j;

.field public final synthetic m:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;Lc1/j;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc1/h;->j:Lorg/json/JSONObject;

    iput-object p2, p0, Lc1/h;->k:Ljava/lang/String;

    iput-object p3, p0, Lc1/h;->l:Lc1/j;

    iput-object p4, p0, Lc1/h;->m:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc1/h;->j:Lorg/json/JSONObject;

    iget-object v1, p0, Lc1/h;->k:Ljava/lang/String;

    iget-object v2, p0, Lc1/h;->l:Lc1/j;

    iget-object v3, p0, Lc1/h;->m:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lc1/j;->a(Lorg/json/JSONObject;Ljava/lang/String;Lc1/j;Ljava/lang/String;)V

    return-void
.end method
