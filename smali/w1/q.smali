.class public final synthetic Lw1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lw1/w$a;

.field public final synthetic k:Lw1/w;


# direct methods
.method public synthetic constructor <init>(Lw1/w$a;Lw1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/q;->j:Lw1/w$a;

    iput-object p2, p0, Lw1/q;->k:Lw1/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw1/q;->j:Lw1/w$a;

    iget-object v1, p0, Lw1/q;->k:Lw1/w;

    invoke-static {v0, v1}, Lw1/w$a;->a(Lw1/w$a;Lw1/w;)V

    return-void
.end method
