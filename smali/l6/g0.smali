.class public final synthetic Ll6/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ll6/i0;

.field public final synthetic k:Ll6/i0$b;

.field public final synthetic l:Lj6/g1;


# direct methods
.method public synthetic constructor <init>(Ll6/i0;Ll6/i0$b;Lj6/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/g0;->j:Ll6/i0;

    iput-object p2, p0, Ll6/g0;->k:Ll6/i0$b;

    iput-object p3, p0, Ll6/g0;->l:Lj6/g1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ll6/g0;->j:Ll6/i0;

    iget-object v1, p0, Ll6/g0;->k:Ll6/i0$b;

    iget-object v2, p0, Ll6/g0;->l:Lj6/g1;

    invoke-static {v0, v1, v2}, Ll6/i0;->l(Ll6/i0;Ll6/i0$b;Lj6/g1;)V

    return-void
.end method
