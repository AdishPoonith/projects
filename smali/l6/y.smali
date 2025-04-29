.class public final synthetic Ll6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/y;


# instance fields
.field public final synthetic a:Ll6/i0;

.field public final synthetic b:Lp6/k0;

.field public final synthetic c:Lm6/w;


# direct methods
.method public synthetic constructor <init>(Ll6/i0;Lp6/k0;Lm6/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/y;->a:Ll6/i0;

    iput-object p2, p0, Ll6/y;->b:Lp6/k0;

    iput-object p3, p0, Ll6/y;->c:Lm6/w;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ll6/y;->a:Ll6/i0;

    iget-object v1, p0, Ll6/y;->b:Lp6/k0;

    iget-object v2, p0, Ll6/y;->c:Lm6/w;

    invoke-static {v0, v1, v2}, Ll6/i0;->r(Ll6/i0;Lp6/k0;Lm6/w;)Ld6/c;

    move-result-object v0

    return-object v0
.end method
