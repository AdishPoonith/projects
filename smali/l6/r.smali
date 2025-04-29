.class public final synthetic Ll6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/y;


# instance fields
.field public final synthetic a:Ll6/i0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ll6/i0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/r;->a:Ll6/i0;

    iput p2, p0, Ll6/r;->b:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ll6/r;->a:Ll6/i0;

    iget v1, p0, Ll6/r;->b:I

    invoke-static {v0, v1}, Ll6/i0;->s(Ll6/i0;I)Ld6/c;

    move-result-object v0

    return-object v0
.end method
