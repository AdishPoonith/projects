.class final Lw4/f0;
.super Lr4/m;
.source "SourceFile"


# instance fields
.field final synthetic a:Lw4/b0;


# direct methods
.method constructor <init>(Lw4/a0;Lw4/b0;)V
    .locals 0

    iput-object p2, p0, Lw4/f0;->a:Lw4/b0;

    invoke-direct {p0}, Lr4/m;-><init>()V

    return-void
.end method


# virtual methods
.method public final C0(III)Lw4/y;
    .locals 1

    iget-object v0, p0, Lw4/f0;->a:Lw4/b0;

    invoke-interface {v0, p1, p2, p3}, Lw4/b0;->a(III)Lw4/y;

    move-result-object p1

    return-object p1
.end method
