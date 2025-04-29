.class public final synthetic Lp0/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/util/ArrayList;

.field public final synthetic k:Lp0/n0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lp0/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/k0;->j:Ljava/util/ArrayList;

    iput-object p2, p0, Lp0/k0;->k:Lp0/n0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp0/k0;->j:Ljava/util/ArrayList;

    iget-object v1, p0, Lp0/k0;->k:Lp0/n0;

    invoke-static {v0, v1}, Lp0/j0$c;->a(Ljava/util/ArrayList;Lp0/n0;)V

    return-void
.end method
