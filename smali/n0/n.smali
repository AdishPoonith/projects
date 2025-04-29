.class public final synthetic Ln0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ln0/q;

.field public final synthetic k:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Ln0/q;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/n;->j:Ln0/q;

    iput-object p2, p0, Ln0/n;->k:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/n;->j:Ln0/q;

    iget-object v1, p0, Ln0/n;->k:Lorg/json/JSONObject;

    invoke-static {v0, v1}, Ln0/q;->c(Ln0/q;Lorg/json/JSONObject;)V

    return-void
.end method
