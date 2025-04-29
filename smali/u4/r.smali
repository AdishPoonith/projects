.class final Lu4/r;
.super Lv4/v;
.source "SourceFile"


# instance fields
.field final synthetic a:Lu4/c$k;


# direct methods
.method constructor <init>(Lu4/c;Lu4/c$k;)V
    .locals 0

    iput-object p2, p0, Lu4/r;->a:Lu4/c$k;

    invoke-direct {p0}, Lv4/v;-><init>()V

    return-void
.end method


# virtual methods
.method public final r2(Lr4/e;)V
    .locals 2

    iget-object v0, p0, Lu4/r;->a:Lu4/c$k;

    new-instance v1, Lw4/o;

    invoke-direct {v1, p1}, Lw4/o;-><init>(Lr4/e;)V

    invoke-interface {v0, v1}, Lu4/c$k;->E(Lw4/o;)V

    return-void
.end method
