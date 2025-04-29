.class final Lu4/q;
.super Lv4/p0;
.source "SourceFile"


# instance fields
.field final synthetic a:Lu4/c$d;


# direct methods
.method constructor <init>(Lu4/c;Lu4/c$d;)V
    .locals 0

    iput-object p2, p0, Lu4/q;->a:Lu4/c$d;

    invoke-direct {p0}, Lv4/p0;-><init>()V

    return-void
.end method


# virtual methods
.method public final e0(Lr4/v;)V
    .locals 2

    iget-object v0, p0, Lu4/q;->a:Lu4/c$d;

    new-instance v1, Lw4/e;

    invoke-direct {v1, p1}, Lw4/e;-><init>(Lr4/v;)V

    invoke-interface {v0, v1}, Lu4/c$d;->t(Lw4/e;)V

    return-void
.end method
