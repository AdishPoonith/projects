.class public final synthetic Ly8/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ly8/h0;

.field public final synthetic k:Lr8/k;


# direct methods
.method public synthetic constructor <init>(Ly8/h0;Lr8/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly8/d0;->j:Ly8/h0;

    iput-object p2, p0, Ly8/d0;->k:Lr8/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly8/d0;->j:Ly8/h0;

    iget-object v1, p0, Ly8/d0;->k:Lr8/k;

    invoke-static {v0, v1}, Ly8/h0;->m(Ly8/h0;Lr8/k;)V

    return-void
.end method
