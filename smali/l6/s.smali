.class public final synthetic Ll6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/y;


# instance fields
.field public final synthetic a:Ll6/i0;

.field public final synthetic b:Ld6/c;

.field public final synthetic c:Ll6/h4;


# direct methods
.method public synthetic constructor <init>(Ll6/i0;Ld6/c;Ll6/h4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/s;->a:Ll6/i0;

    iput-object p2, p0, Ll6/s;->b:Ld6/c;

    iput-object p3, p0, Ll6/s;->c:Ll6/h4;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ll6/s;->a:Ll6/i0;

    iget-object v1, p0, Ll6/s;->b:Ld6/c;

    iget-object v2, p0, Ll6/s;->c:Ll6/h4;

    invoke-static {v0, v1, v2}, Ll6/i0;->k(Ll6/i0;Ld6/c;Ll6/h4;)Ld6/c;

    move-result-object v0

    return-object v0
.end method
