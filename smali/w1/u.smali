.class public final synthetic Lw1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lw1/w$a;

.field public final synthetic k:Lw1/w;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lw1/w$a;Lw1/w;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/u;->j:Lw1/w$a;

    iput-object p2, p0, Lw1/u;->k:Lw1/w;

    iput p3, p0, Lw1/u;->l:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lw1/u;->j:Lw1/w$a;

    iget-object v1, p0, Lw1/u;->k:Lw1/w;

    iget v2, p0, Lw1/u;->l:I

    invoke-static {v0, v1, v2}, Lw1/w$a;->f(Lw1/w$a;Lw1/w;I)V

    return-void
.end method
