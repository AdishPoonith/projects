.class public final synthetic Ly8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ly8/h0;

.field public final synthetic k:Lr8/k;

.field public final synthetic l:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Ly8/h0;Lr8/k;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly8/v;->j:Ly8/h0;

    iput-object p2, p0, Ly8/v;->k:Lr8/k;

    iput-object p3, p0, Ly8/v;->l:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ly8/v;->j:Ly8/h0;

    iget-object v1, p0, Ly8/v;->k:Lr8/k;

    iget-object v2, p0, Ly8/v;->l:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Ly8/h0;->g(Ly8/h0;Lr8/k;Ljava/lang/Exception;)V

    return-void
.end method
