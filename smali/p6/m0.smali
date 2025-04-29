.class public final synthetic Lp6/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp6/p0;

.field public final synthetic k:Lp6/l$a;


# direct methods
.method public synthetic constructor <init>(Lp6/p0;Lp6/l$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/m0;->j:Lp6/p0;

    iput-object p2, p0, Lp6/m0;->k:Lp6/l$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp6/m0;->j:Lp6/p0;

    iget-object v1, p0, Lp6/m0;->k:Lp6/l$a;

    invoke-static {v0, v1}, Lp6/p0;->d(Lp6/p0;Lp6/l$a;)V

    return-void
.end method
